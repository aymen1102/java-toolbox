package bestPractices.bestPractice13;

/**
 * If we are using too many conditional if-else statements it will impact performance since JVM will have to compare the conditions.
 * This can become worse if the same is used in looping statements like for, while, etc. If there are too many conditions in your business logic try to group the conditions and get the boolean outcome and use it in the if statement.
 * Also, we can think of using a switch statement instead of multiple if-else if possible. Switch statement has a performance advantage over if – else.
 * The sample is provided below as an illustration which is to be avoided as follows:
 */
public class BestPractice13 {
    public static void main(String[] args) {
        int a = 4;
        int b = 99;
        int c = 566;
        int d = 5765;

        /** Bad habit*/
        if(a>d){
            if(c>b){
                if(d==c){
                    if(c==b){
                        System.out.println("Finally, i'am here ! ");
                    }
                }
            }
        }

        /** Good habit*/
        if((c>b&&d==c)&&c==b){
            System.out.println("");
        }
    }


}
