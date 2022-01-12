package com.company.devices;

import java.util.Comparator;

public class ApplicationPriceComparator implements Comparator<Application> {

    @Override
    public int compare(Application o1, Application o2) {
        if(o1.price.compareTo(o2.price) == 0)
        {
            return 1;
        }
        return o1.price.compareTo(o2.price);
    }
}
