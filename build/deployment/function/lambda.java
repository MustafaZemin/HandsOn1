import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyLambdaFunction implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request input, Context context) {
        int num1 = input.getNum1();
        int num2 = input.getNum2();
        int sum = sum(num1, num2);
        return new Response(sum);
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static class Request {
        private int num1;
        private int num2;

        public int getNum1() {
            return num1;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }
    }

    public static class Response {
        private int sum;

        public Response(int sum) {
            this.sum = sum;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}