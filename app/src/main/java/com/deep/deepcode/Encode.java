package com.deep.deepcode;

import android.widget.TextView;

public class Encode {
    public Encode(int number, TextView editText2, String edit){



        for (int loop =0; loop<number; loop++) {


            /////////////////small letter//////////////////
            ///////////////////////////////////////////////

            if (edit.charAt(loop) == new Character('a')) {
                editText2.append("oANBm");

            } else if (edit.charAt(loop) == new Character('b')) {
                editText2.append("3SAyp");

            } else if (edit.charAt(loop) == new Character('c')) {
                editText2.append("ffRy8");

            } else if (edit.charAt(loop) == new Character('d')) {
                editText2.append("kjKQC");

            } else if (edit.charAt(loop) == new Character('e')) {
                editText2.append("aFqUj");

            } else if (edit.charAt(loop) == new Character('f')) {
                editText2.append("iRul2");

            } else if (edit.charAt(loop) == new Character('g')) {
                editText2.append("kQoFL");

            } else if (edit.charAt(loop) == new Character('h')) {
                editText2.append("CVlRD");

            } else if (edit.charAt(loop) == new Character('i')) {
                editText2.append("Q81j3");

            } else if (edit.charAt(loop) == new Character('j')) {
                editText2.append("s1hvO");

            } else if (edit.charAt(loop) == new Character('k')) {
                editText2.append("lx5ET");

            } else if (edit.charAt(loop) == new Character('l')) {
                editText2.append("TmyK4");

            } else if (edit.charAt(loop) == new Character('m')) {
                editText2.append("K2IWd");

            } else if (edit.charAt(loop) == new Character('n')) {
                editText2.append("V8U+c");

            } else if (edit.charAt(loop) == new Character('o')) {
                editText2.append("Ia88+");

            } else if (edit.charAt(loop) == new Character('p')) {
                editText2.append("3e34f");

            } else if (edit.charAt(loop) == new Character('q')) {
                editText2.append("I0fD8");

            } else if (edit.charAt(loop) == new Character('r')) {
                editText2.append("dATIo");

            } else if (edit.charAt(loop) == new Character('s')) {
                editText2.append("dBaX8");

            } else if (edit.charAt(loop) == new Character('t')) {
                editText2.append("o4wZP");

            } else if (edit.charAt(loop) == new Character('u')) {
                editText2.append("IK4UW");

            } else if (edit.charAt(loop) == new Character('v')) {
                editText2.append("Ps+o4");

            } else if (edit.charAt(loop) == new Character('w')) {
                editText2.append("0fNCs");

            } else if (edit.charAt(loop) == new Character('x')) {
                editText2.append("qwUXa");

            } else if (edit.charAt(loop) == new Character('y')) {
                editText2.append("S83KB");

            } else if (edit.charAt(loop) == new Character('z')) {
                editText2.append("f7FKe");

            }
             /////////////Capital letter//////////////////
            /////////////////////////////////////////////

            else if (edit.charAt(loop) == new Character('A')) {
                editText2.append("nfu3d");

            } else if (edit.charAt(loop) == new Character('B')) {
                editText2.append("jtj2h");

            } else if (edit.charAt(loop) == new Character('C')) {
                editText2.append("23cf;");

            } else if (edit.charAt(loop) == new Character('D')) {
                editText2.append("55dfs");

            } else if (edit.charAt(loop) == new Character('E')) {
                editText2.append("+df2s");

            } else if (edit.charAt(loop) == new Character('F')) {
                editText2.append("4fdfg");

            } else if (edit.charAt(loop) == new Character('G')) {
                editText2.append("stdfh");

            } else if (edit.charAt(loop) == new Character('H')) {
                editText2.append("sy4yt");

            } else if (edit.charAt(loop) == new Character('I')) {
                editText2.append("45tef");

            } else if (edit.charAt(loop) == new Character('J')) {
                editText2.append("9grus");

            } else if (edit.charAt(loop) == new Character('K')) {
                editText2.append("+edf3");

            } else if (edit.charAt(loop) == new Character('L')) {
                editText2.append("-Asdd");

            } else if (edit.charAt(loop) == new Character('M')) {
                editText2.append("Dcsef");

            } else if (edit.charAt(loop) == new Character('N')) {
                editText2.append("2dffs");

            } else if (edit.charAt(loop) == new Character('O')) {
                editText2.append("0wsdf");

            } else if (edit.charAt(loop) == new Character('P')) {
                editText2.append("34ef4");

            } else if (edit.charAt(loop) == new Character('Q')) {
                editText2.append("1sfsr");

            } else if (edit.charAt(loop) == new Character('R')) {
                editText2.append("'as54");

            } else if (edit.charAt(loop) == new Character('S')) {
                editText2.append(",drtb");

            } else if (edit.charAt(loop) == new Character('T')) {
                editText2.append("2wer4");

            } else if (edit.charAt(loop) == new Character('U')) {
                editText2.append(".dfge");

            } else if (edit.charAt(loop) == new Character('V')) {
                editText2.append("?erfs");

            } else if (edit.charAt(loop) == new Character('W')) {
                editText2.append("!dfgd");

            } else if (edit.charAt(loop) == new Character('X')) {
                editText2.append(";efdg");

            } else if (edit.charAt(loop) == new Character('Y')) {
                editText2.append(":dfgw");

            } else if (edit.charAt(loop) == new Character('Z')) {
                editText2.append("+sdfv");

            }








            /////////////////spacal/////////////////
            else if (edit.charAt(loop) == new Character(' ')) {
                editText2.append("d4n1k");

            } else if (edit.charAt(loop)== new Character('.')) {
                editText2.append("jhdF3");

            }else if (edit.charAt(loop)==new Character(',')){
                editText2.append("we23c");

            } else if (edit.charAt(loop)== new Character('?')) {
                editText2.append("nsed2");

            }  else if (edit.charAt(loop)== new Character('\n')) {
                editText2.append("w3rw4");

            }

            else {
                editText2.setText("Error C");
                break;

            }




            ///////////////loop end/////////////////
        }


    }
}
