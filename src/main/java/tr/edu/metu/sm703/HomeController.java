package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        int res = sum(28, 49);
        //System.out.println(res);
        return Collections.singletonMap("message", res);
    }

    public static int sum(int num1, int num2)
    {
        return num1+num2;
    }
}
