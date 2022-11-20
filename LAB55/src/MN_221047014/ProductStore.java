package MN_221047014;


import java.io.FileNotFoundException;
import java.io.IOException;

interface ProductStore {
    public void addProduct(int product_id, String product_name, int product_price) throws IOException ;
    void upDate(int product_id, String product_name, int product_price) throws IOException;
    void Display() throws IOException;
}
