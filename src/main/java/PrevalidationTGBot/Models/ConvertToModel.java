package PrevalidationTGBot.Models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertToModel {
    public ConvertToModel() {

    }

    public static List<RowData> getInfoByCSV(List<String[]> csvResult) throws IOException {

        List<RowData> listResult = new ArrayList<>();

        RowData rowData;  //вытащим необходимые столбцы
        for (String[] str : csvResult) {
            rowData = new RowData(str[68], str[71], str[12], str[14], str[13], str[17],
                    str[31], str[33], str[74], str[75], str[66], str[57]);
            listResult.add(rowData);

        }
        return listResult;
    }


}