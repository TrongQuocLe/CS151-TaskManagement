package serverside;

import java.util.List;

public interface Observer {
    public void updateContainer(List<ServerContainer> containers, ServerContainer container);

}
