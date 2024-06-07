import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;

public class MazeQuestion {
    public static void main(String[] args) {
        //Path(" ",3,3);
        //System.out.println(PathRetDiagonol("",3,3));

        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        PathRestrictionRiver(" ",board,0,0);
    }
    static int CountNoOfPaths(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=CountNoOfPaths(r-1,c);
        int right=CountNoOfPaths(r,c-1);
        return left+right;

    }
    static void Path(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            Path(p+'D',r-1,c);
        }
        if(c>1){
            Path(p+'R',r,c-1);
        }
    }

    static ArrayList<String> PathRetDiagonol(String p,int r ,int c){
        if(r==1&&c==1){
            ArrayList<java.lang.String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<java.lang.String> list=new ArrayList<>();
        if(r>1&&c>1){
            list.addAll(PathRetDiagonol(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(PathRetDiagonol(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(PathRetDiagonol(p+'R',r,c-1));
        }
        return list;
    }

    static void PathRestrictionRiver(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            PathRestrictionRiver(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            PathRestrictionRiver(p+'R',maze,r,c+1);
        }
    }

}
