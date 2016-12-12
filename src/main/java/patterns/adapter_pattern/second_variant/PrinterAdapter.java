package patterns.adapter_pattern.second_variant;

import java.util.List;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class PrinterAdapter implements PageListPrinter {

    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list){
            printer.print(text);
        }
    }
}
