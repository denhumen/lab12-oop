package edu.ucu.ua.apps.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StampingVisitor {
    private boolean inGroup;

    public Map<String, Object> onGroupStart(Group group, Map<String, String> headers) {
        this.inGroup = true;
        Map<String, Object> res = new HashMap<>();
        List<Boolean> inGroupList = new ArrayList<>();
        inGroupList.add(this.inGroup);
        res.put("in group", inGroupList);
        res.put("stamped headers", Arrays.asList("in_group"));
        return res;
    }

    public void onGroupEnd(Group group, Map<String, String> headers) {
        this.inGroup = false;
    }

    public Map<String, Object> onSignature(Task sig, Map<String, String> headers) {
        Map<String, Object> res = new HashMap<>();
        List<Boolean> inGroupList = new ArrayList<>();
        inGroupList.add(this.inGroup);
        res.put("in group", inGroupList);
        res.put("stamped headers", Arrays.asList("in_group"));
        return res;
    }
}
