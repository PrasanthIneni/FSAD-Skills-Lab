public class ExceptionDemo {

    public static void main(String[] args) {

        try{

            int id=-1;

            if(id<0){
                throw new Exception("Student Not Found");
            }

        }
        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }
}