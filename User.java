package com.example.oturv5;

import java.util.ArrayList;

     abstract class User {
        String number;
        String password;

        public User()
        {
        }
        public User(String number, String password) {
            this.number = number;
            this.password = password;
        }

        public boolean isMatched(ArrayList<User> list, String num, String passwo){
            for(int i = 0;i<list.size();i++){
                if(list.get(i).getNumber().equals(num) && list.get(i).getPassword().equals(passwo))
                    return true;
            }
            return false;
        }

        abstract String getType();

        public String getNumber() {
            return this.number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getPassword(){
            return password;
        }

        public void setPassword(String password){
            this.password = password;
        }

         public abstract void rentHouse(House house);
     }

