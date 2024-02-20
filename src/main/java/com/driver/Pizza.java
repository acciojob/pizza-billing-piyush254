package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private  int cheese;
    private  int toppings;
    boolean isextrachesseadded;

    boolean isextratoppingsadd;
    boolean isTakeawayadded;
    boolean isBilgernted;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBilgernted = false;
        this.isextratoppingsadd = false;
        this.isextrachesseadded = false;
        this.isTakeawayadded = false;

        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill = "Base Price Of The Pizza: "+ this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isextrachesseadded){
            this.price = this.price +cheese;
            isextrachesseadded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (! isextratoppingsadd){
            this.price = this.price+ toppings;
            isextratoppingsadd = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isTakeawayadded){
            this.price = this.price+20;
            isTakeawayadded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBilgernted){
//            System.out.println(isextrachesseadded);
                if ( isextrachesseadded){
                    this.bill += "Extra Cheese Added: "+this.cheese+"\n";
                }
                if (isextratoppingsadd){
                    this.bill += "Extra Toppings Added: "+this.toppings+"\n";
                }
                if(isTakeawayadded){
                    this.bill += "Paperbag Added: "+"20"+"\n";
                }
                this.bill += "Total Price: "+this.price+"\n";
                isBilgernted = true;
        }
        return this.bill;
    }
}
