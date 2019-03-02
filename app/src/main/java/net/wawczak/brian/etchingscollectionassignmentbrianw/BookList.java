package net.wawczak.brian.etchingscollectionassignmentbrianw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import net.wawczak.brian.etchingscollectionassignmentbrianw.DataPackage.ListData;
import net.wawczak.brian.etchingscollectionassignmentbrianw.DataPackage.BookData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList extends AppCompatActivity {

    // reference to the data list
    List<ListData> dataItemList = BookData.dataItemList;

    List<String> bookTitle = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        for (ListData item : dataItemList) {

            bookTitle.add(item.getBookTitle());


        }
        //sort data
        Collections.sort(bookTitle);


       ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1
               , bookTitle);


        //bind array adaptor to the list view
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);
    }
}
