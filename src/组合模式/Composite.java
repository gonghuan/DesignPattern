package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> list;
	
	public Composite(){
        this.list = new ArrayList<>();
    }
	
	
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		for(Component component : list){
            component.operator();
        }
	}
	
	@Override
    public void addChild(Component child) {
        list.add(child);
    }
    @Override
    public void removeChild(Component child) {
        list.remove(child);
    }
    @Override
    public Component getChild(int index) {
        return list.get(index);
    }

}
