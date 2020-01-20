package com.example.sccm.recyclerviewscrollanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;

    RecyclerAdapter mRecyclerAdapter;

    private String headline[] = {
            "This is Headline",
            "This is Headline",
            "This is Headline",
            "This is Headline",
            "This is Headline",
            "This is Headline",
            "This is Headline",
            "This is Headline",
            "This is Headline"
    };


    private Integer image[] = {

            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher

    };


    private String description[] = {

            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",
            "Wrapper around layoutChildren() that handles animating changes caused by layout. Animations work on the assumption that there are five different kinds of items in play:\n" +
                    "DISAPPEARING: items exist in the data set before/after, but changed from visible to non-visible in the process of layout (they were moved off screen as a side-effect of other changes)\n" +
                    "APPEARING: items exist in the data set before/after, but changed from non-visible to visible in the process of layout (they were moved on screen as a side-effect of other changes)\n" +
                    "The overall approach figures out what items exist before/after layout and infers one of the five above states for each of the items. Then the animations are set up accordingly:",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);

        ArrayList<RecyclerModel> recyclerModels = prepareData();
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.setHasFixedSize(true);
        mRecyclerAdapter = new RecyclerAdapter(recyclerModels,this);
        recycler_view.setAdapter(mRecyclerAdapter);
    }

    private ArrayList<RecyclerModel> prepareData() {

        ArrayList<RecyclerModel> theImage = new ArrayList<>();
        for (int i = 0; i < description.length ; i++){
            RecyclerModel createList = new RecyclerModel();
            createList.setHeadline(headline[i]);
            createList.setDescription(description[i]);
            createList.setImage(image[i]);
            theImage.add(createList);
        }
        return theImage;
    }
}
