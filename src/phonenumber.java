public class phonenumber {
        private String countrycode=new String();
        private String number=new String();
        public   void setcountrycode(String countrycode){
            this.countrycode=countrycode;
        }
        public  void setnumber(String number){
            this.number=number;
        }
        public String toString() {
            if (countrycode == null) countrycode = "-";
            if (number == null) number = "-";
            return "(" + countrycode + ") " + number;
        }

    public String getNumber() {
        return number;
    }
}
