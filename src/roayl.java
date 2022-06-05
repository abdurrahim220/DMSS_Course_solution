class A{
    private int values;

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }
}
class B{
    public static void main(String[] args) {
        A r=new A();
        r.setValues(100);
        System.out.println(r.getValues());
    }
}