package com.jobamax.appjobamax.jobseeker.profile.account.deleteAccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jobamax.appjobamax.NewSplashActivity;
import com.jobamax.appjobamax.base.BaseFragment;
import com.jobamax.appjobamax.databinding.FragmentSeekerDeleteAccountFinalBinding;
import com.jobamax.appjobamax.dialog.DeleteAccountDialog;
import com.jobamax.appjobamax.enums.ParseCloudFunction;
import com.jobamax.appjobamax.jobseeker.view_model.SeekerHomeViewModel;
import com.parse.FunctionCallback;
import com.parse.ParseCloud;
import com.parse.ParseUser;
import com.pushwoosh.Pushwoosh;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/jobamax/appjobamax/jobseeker/profile/account/deleteAccount/SeekerDeleteAccountFinalFragment;", "Lcom/jobamax/appjobamax/base/BaseFragment;", "Lcom/jobamax/appjobamax/jobseeker/profile/account/deleteAccount/SeekerDeleteAccountFinalInterface;", "()V", "binding", "Lcom/jobamax/appjobamax/databinding/FragmentSeekerDeleteAccountFinalBinding;", "getBinding", "()Lcom/jobamax/appjobamax/databinding/FragmentSeekerDeleteAccountFinalBinding;", "setBinding", "(Lcom/jobamax/appjobamax/databinding/FragmentSeekerDeleteAccountFinalBinding;)V", "viewModel", "Lcom/jobamax/appjobamax/jobseeker/view_model/SeekerHomeViewModel;", "getViewModel", "()Lcom/jobamax/appjobamax/jobseeker/view_model/SeekerHomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "configureUi", "", "observeDeleteStatus", "observeLiveData", "onBackPress", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteAccount", "app_debug"})
public final class SeekerDeleteAccountFinalFragment extends com.jobamax.appjobamax.base.BaseFragment implements com.jobamax.appjobamax.jobseeker.profile.account.deleteAccount.SeekerDeleteAccountFinalInterface {
    public com.jobamax.appjobamax.databinding.FragmentSeekerDeleteAccountFinalBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public SeekerDeleteAccountFinalFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jobamax.appjobamax.databinding.FragmentSeekerDeleteAccountFinalBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.jobamax.appjobamax.databinding.FragmentSeekerDeleteAccountFinalBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jobamax.appjobamax.jobseeker.view_model.SeekerHomeViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void configureUi() {
    }
    
    private final void observeLiveData() {
    }
    
    private final void observeDeleteStatus() {
    }
    
    @java.lang.Override()
    public void onDeleteAccount() {
    }
    
    @java.lang.Override()
    public void onBackPress() {
    }
}