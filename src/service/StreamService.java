package service;

import comparator.StreamComporator;
import iterator.Stream;
import module.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    public List<Stream> getSortedStream(List<Stream> streamList){
        streamList.sort(new StreamComporator());
        return streamList;
    }
}
