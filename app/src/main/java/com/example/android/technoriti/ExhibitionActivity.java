package com.example.android.technoriti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.ViewAnimator;

/**
 * Created by Swedish_Sweta on 2/26/2018.
 */

public class ExhibitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibition);
        final ViewAnimator viewAnimator = (ViewAnimator)this.findViewById(R.id.viewFlipper);
        final ViewAnimator viewAnimator1 = (ViewAnimator)this.findViewById(R.id.viewFlipper1);
        final ViewAnimator viewAnimator2 = (ViewAnimator)this.findViewById(R.id.viewFlipper2);


        viewAnimator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator, AnimationFactory.FlipDirection.LEFT_RIGHT);
            }

        });

        // The following click listeners are not needed (only here to test that clicks
        // are routed to the correct subview of the view animator).

        this.findViewById(R.id.view_exhibition).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator, AnimationFactory.FlipDirection.LEFT_RIGHT);
            }

        });

        this.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator, AnimationFactory.FlipDirection.LEFT_RIGHT);

            }

        });
        viewAnimator1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationFactory.flipTransition(viewAnimator1, AnimationFactory.FlipDirection.LEFT_RIGHT);
            }

        });

        // The following click listeners are not needed (only here to test that clicks
        // are routed to the correct subview of the view animator).

        this.findViewById(R.id.view_exhibition1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator1, AnimationFactory.FlipDirection.LEFT_RIGHT);

            }

        });

        this.findViewById(R.id.btn_back1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator1, AnimationFactory.FlipDirection.LEFT_RIGHT);

            }

        });
        viewAnimator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationFactory.flipTransition(viewAnimator2, AnimationFactory.FlipDirection.LEFT_RIGHT);
            }

        });

        // The following click listeners are not needed (only here to test that clicks
        // are routed to the correct subview of the view animator).

        this.findViewById(R.id.view_exhibition2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator2, AnimationFactory.FlipDirection.LEFT_RIGHT);

            }

        });

        this.findViewById(R.id.btn_back2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator2, AnimationFactory.FlipDirection.LEFT_RIGHT);

            }

        });
    }
}
