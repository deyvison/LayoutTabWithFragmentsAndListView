package tcc.ufpb.com.br.tablayoutexample2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tcc.ufpb.com.br.tablayoutexample2.R;

/**
 * Created by Deyvison on 23/12/2016.
 */
public class PalavraNivelMedioAdapter extends BaseAdapter {

    List<String> palavraNivelMedio;
    Context context;

    public PalavraNivelMedioAdapter(Context context){
        this.context= context;

        palavraNivelMedio = new ArrayList<>();
        palavraNivelMedio.add("Médio 1");
        palavraNivelMedio.add("Médio 2");
        palavraNivelMedio.add("Médio 3");
        palavraNivelMedio.add("Médio 4");
        palavraNivelMedio.add("Médio 5");
        palavraNivelMedio.add("Médio 6");
        palavraNivelMedio.add("Médio 7");
        palavraNivelMedio.add("Médio 8");
        palavraNivelMedio.add("Médio 9");

    }

    @Override
    public int getCount() {
        return palavraNivelMedio.size();
    }

    @Override
    public String getItem(int position) {
        return palavraNivelMedio.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        view = LayoutInflater.from(context).inflate(R.layout.layout_item_list, parent, false);

        String retorno = palavraNivelMedio.get(position);


        TextView textView = (TextView) view.findViewById(R.id.textView);



        textView.setText(retorno);

        return view;
    }
}
