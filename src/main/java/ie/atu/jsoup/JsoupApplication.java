package ie.atu.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupApplication {
    public static void main(String[] args) {
        try {
            // URL for the Intel Core i5-10400F on PCPartPicker
            String url = "https://pcpartpicker.com/product/vrhmP6/intel-core-i5-10400f-29-ghz-6-core-processor-bx8070110400f";
            Document doc = org.jsoup.Jsoup.connect(url).get(); // Whole HTML

            // https://pcpartpicker.com/product/vrhmP6/intel-core-i5-10400f-29-ghz-6-core-processor-bx8070110400f
            // Selector for the price element - replace with the actual selector
            Element priceElement = doc.select(".td__finalPrice .pp_async_mr").first();

            if (priceElement != null) {
                String price = priceElement.text();
                System.out.println("Price of Intel Core i5-10400F: " + price);
            } else {
                System.out.println("Price information not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
