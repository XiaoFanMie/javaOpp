package practise;

public class People {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.equals("中国人")){
            this.country=country;
            System.out.println(country+"说中文");
        }else
        {
            this.country="美国人";
            this.speak();
        }

    }

    public void speak(){
        System.out.println(country+"讲英语");
    }

}
