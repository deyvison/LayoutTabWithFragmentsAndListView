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
public class PalavraNivelDificilAdapter extends BaseAdapter {

    List<String> palavraNivelDificil;
    Context context;


    public PalavraNivelDificilAdapter(Context context){
        this.context= context;

         palavraNivelDificil = new ArrayList<>();
         palavraNivelDificil.add("Dificil 1");
         palavraNivelDificil.add("Dificil 2");
         palavraNivelDificil.add("Dificil 3");
         palavraNivelDificil.add("Dificil 4");
         palavraNivelDificil.add("Dificil 5");
         palavraNivelDificil.add("Dificil 6");
         palavraNivelDificil.add("Dificil 7");
         palavraNivelDificil.add("Dificil 8");
         palavraNivelDificil.add("Dificil 9");

    }

    @Override
    public int getCount() {
        return  palavraNivelDificil.size();
    }

    @Override
    public String getItem(int position) {
        return  palavraNivelDificil.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        view = LayoutInflater.from(context).inflate(R.layout.layout_item_list, parent, false);

        String retorno =  palavraNivelDificil.get(position);


        TextView textView = (TextView) view.findViewById(R.id.textView);



        textView.setText(retorno);

        return view;
    }
}
