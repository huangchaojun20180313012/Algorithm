package net.lzzy.algorithm.algorlib;

/**
 * Created by lzzy_gxy on 2019/6/13.
 * Description:
 */
public class DirectSort<T extends Comparable<? super T>> extends BaseSort< T > {




    public DirectSort(T[] item){
        super(item);

    }
    @Override
    public void Sort() {

        for (int i=0;i<items.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<items.length;j++){
//               items[minPos].compareTo(items[j])>0
                if (bigger(items[minPos],items[j])){
                    minPos=j;
                    movestep++;
                }
            }
            swap(minPos,i);
        }

    }





}
