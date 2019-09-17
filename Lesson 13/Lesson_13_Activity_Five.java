Scanner input = new Scanner(System.in)
    Integer firstNum = (int)(Math.Random()*12)+1,  secondNum = (int)(Math.Random()*12)+1;

    if(input.nextInt() == (firstNum*secondNum)){
        System.out.println("Correct");
    }else{
        System.out.println("Wrong");
    }
