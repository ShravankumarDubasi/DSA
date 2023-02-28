package com.starter;

public class generics<X,Y> {

        X x;
        Y y;
        public generics(X x,Y y){
            this.x=x;
            this.y=y;
        }
        public void description(){
            System.out.println(x+" and "+y);
        }
    }

