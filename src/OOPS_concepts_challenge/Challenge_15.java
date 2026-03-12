    package OOPS_concepts_challenge;

    public class Challenge_15
    {
     public static void main(String[] args) {

         AgeChecker ca = new AgeChecker();
         try
         {
             ca.checkAge(16);
         }
         catch(InvalidAgeException e)
         {
             System.out.println(e.getMessage());
         }

     }
    }

    class InvalidAgeException extends Exception
    {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    class AgeChecker
    {
        public void checkAge(int age) throws InvalidAgeException
        {
            if(age<18)
            {
                throw new InvalidAgeException("Age must be 18 or above");
            }

        }
    }