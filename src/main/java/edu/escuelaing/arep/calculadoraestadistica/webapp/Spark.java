package edu.escuelaing.arep.calculadoraestadistica.webapp;

import static spark.Spark.*;

import com.google.gson.Gson;
import edu.escuelaing.arep.calculadoraestadistica.calculator.Calculator;
public class Spark {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        Calculator c = new Calculator();

        port(getPort());
        staticFileLocation("/");
        get("/", (req, res) -> {
            res.redirect("/index.html");
            res.status(200);
            return null;
        });
        post("/calculate",(req,res) ->{
            String string = c.calculateMeanAndStd(req.body());
            Gson gson = new Gson();
            return gson.toJson(string);
        });

    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}