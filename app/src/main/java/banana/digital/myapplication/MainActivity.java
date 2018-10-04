package banana.digital.myapplication;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.transition.Transition;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.graphics.Color.BLUE;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textView) TextView textView;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        CoordinatorLayout viewGroup = findViewById(R.id.root_container);

        ButterKnife.bind(this, viewGroup);
        //textView = findViewById(R.id.textView);  Можно не использовать, т.к ButterKnife уже обозначил его.



/*
        final ValueAnimator animator = ValueAnimator.ofFloat(0f, 128f);
        animator.setDuration(2000);
        animator.start();
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                final float value = (float) valueAnimator.getAnimatedValue(); //[0f - 128f]
                textView.setTranslationY(value);
                Log.e("ValueTest", String.valueOf(value));


            }
        });
*/



        //ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 10f);
        //objectAnimator.setDuration(2000);
        //objectAnimator.start();

/*
        final Handler handler = new Handler();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                //TODO
                            }
                        });
                    }
                }, 2000, 2000);

            }
        });
*/
    }

}
