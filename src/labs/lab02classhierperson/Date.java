package labs.lab02classhierperson;

class Date {
    int dd, mm, yy;

    Date(int d, int m, int y){
        this.dd = d;
        this.mm = m;
        this.yy = y;
    }

    String getDate(){
        return dd+"."+mm+"."+yy;
    }
}
