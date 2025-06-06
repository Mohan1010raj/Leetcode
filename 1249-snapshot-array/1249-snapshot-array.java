class SnapshotArray {
    Map<Integer,Integer> m;
    List<Map<Integer,Integer>> l;
    public SnapshotArray(int length) {
        m=new HashMap<>(length);
        l=new ArrayList<>(length);
    }
    
    public void set(int index, int val) {
        m.put(index,val);
    }
    
    public int snap() {
        l.add(m);
        m=new HashMap<>();
        return l.size()-1;
    }
    
    public int get(int index, int snap_id) {
        for(int i=snap_id;i>=0;i--){
            if(l.get(i).containsKey(index)){
                return l.get(i).get(index);
            }
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */