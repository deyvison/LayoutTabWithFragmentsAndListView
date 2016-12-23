package tcc.ufpb.com.br.tablayoutexample2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import tcc.ufpb.com.br.tablayoutexample2.R;

/**
 * Created by Deyvison on 23/12/2016.
 */
public class PalavraNivelFacilAdapter extends BaseAdapter {

    List<String> palavraNivelFacil;
    Context context;

    public PalavraNivelFacilAdapter(Context context){
        this.context= context;

        palavraNivelFacil = new ArrayList<>();
        palavraNivelFacil.add("Fácil 1");
        palavraNivelFacil.add("Fácil 2");
        palavraNivelFacil.add("Fácil 3");
        palavraNivelFacil.add("Fácil 4");
        palavraNivelFacil.add("Fácil 5");
        palavraNivelFacil.add("Fácil 6");
        palavraNivelFacil.add("Fácil 7");
        palavraNivelFacil.add("Fácil 8");
        palavraNivelFacil.add("Fácil 9");

    }

    @Override
    public int getCount() {
        return palavraNivelFacil.size();
    }

    @Override
    public String getItem(int position) {
        return palavraNivelFacil.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        view = LayoutInflater.from(context).inflate(R.layout.layout_item_list, parent, false);

        String retorno = palavraNivelFacil.get(position);


        TextView textView = (TextView) view.findViewById(R.id.textView);



        textView.setText(retorno);

        return view;
    }
}
