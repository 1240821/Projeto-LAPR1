import org.la4j.Matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lapr {
    static Scanner sc= new Scanner(System.in);
    static final int MAXCOLUNAS=256;
    static final int MAXLINHAS=256;
    public static double[][] escrevermatriz(String input) throws FileNotFoundException {
        Scanner ps=new Scanner(new File(input));
        double[][]Matriz=new double[MAXCOLUNAS][MAXLINHAS];
        int i=0;
        int j=0;
        while ((ps.hasNextLine() && i<MAXCOLUNAS) && j<MAXLINHAS){
            String[] line= ps.nextLine().split(",");
                for(j=0;j<line.length;j++){
                    Matriz[i][j]=Double.parseDouble(line[j].trim());
                }
                i++;
        }
        ps.close();
        double[][]testar=new double[i][j];
        for (int k=0;k<testar.length;k++){
            for(int l=0;l<testar[0].length;l++){
                testar[k][l]=Matriz[k][l];
            }
        }
        return testar;
    }

    public static void main(String[] args)throws FileNotFoundException {
        String input="C:\\Users\\cerqu\\IdeaProjects\\teste\\src\\week8\\teste";
        double[][]teste=escrevermatriz(input);

    }
}
