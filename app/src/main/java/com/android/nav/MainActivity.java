package com.android.nav;

import static androidx.navigation.Navigation.findNavController;
import static androidx.navigation.ui.ActivityKt.setupActionBarWithNavController;
import static androidx.navigation.ui.NavigationUI.setupWithNavController;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.FragmentNavigatorDestinationBuilder;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.BottomNavigationViewKt;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import org.jetbrains.annotations.NotNull;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigation;
    String startDestination = "home";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         navigation = findViewById(R.id.navigation);
        NavController navController =  findNavController(this, R.id.nav_host_fragment_activity_main);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,  R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        setupActionBarWithNavController(this,navController,appBarConfiguration);
        setupWithNavController((NavigationBarView)navigation, navController);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}