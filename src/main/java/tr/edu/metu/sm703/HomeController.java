package tr.edu.metu.sm703;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/")
public class HomeController {

    @Get("/")
    public String index() {
        return "Hello World Production ";
    }
}
