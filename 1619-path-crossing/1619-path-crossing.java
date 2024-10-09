class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set=new HashSet<>();
        int x=0;
        int y=0;
        set.add(x+" "+y);
        for(int i=0;i<path.length();i++){
            char c=path.charAt(i);
            switch(c){
                case 'N':
					y+=1;
					break;
				case 'S':
					y-=1;
					break;
				case 'E':
					x+=1;
					break;
				case 'W':
					x-=1;
            }
            String pos=x+" "+y;
            if(set.contains(pos)){
                return true;
            }
            set.add(pos);
        }
        return false;
    }
}