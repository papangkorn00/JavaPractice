package Containment;

import javax.management.ObjectName;

public interface Containable {
    public boolean add(Object o);
    public boolean get(Object o);
}
