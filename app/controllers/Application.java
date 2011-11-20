package controllers;

import models.Website;
import play.data.validation.Valid;
import play.data.validation.Validation;
import play.mvc.With;
import play.mvc.Controller;

import java.util.List;

//@With(Secure.class)
public class Application extends Controller {
    public static void add() {
        render();
    }

    public static void added(@Valid Website website) {
        if (Validation.hasErrors()) {
            Validation.keep();
            params.flash();
            add();
        }
		
		render();
    }
}
