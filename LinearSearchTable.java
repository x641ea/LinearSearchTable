public  class LinearSearchTable {
    public static void main(String[] args) {
        LinearSearch.Entry table = new LinearSearch.Entry();

        table.add(1, "one");
        table.add(10, "ten");
        table.add(2, "two");
// ******

        String x;
        x = (String) table.search(1);    //searching
        if (x != null) {
            System.out.println("value = " + x);
        } else {
            System.out.println("Not Found");
        }
    }
}
