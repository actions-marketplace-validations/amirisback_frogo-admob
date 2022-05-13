package com.frogobox.admob.core

import android.content.Context
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * ImplementationAdmob
 * Copyright (C) 10/02/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.basehelper
 *
 */

@Deprecated("Please re-import to latest package and use the new one")
interface IFrogoAdmob {

    fun setupAdmobApp(context: Context)

    // ---------------------------------------------------------------------------------------------

    fun showAdBanner(
        mAdView: AdView,
        timeoutMilliSecond: Int?,
        keyword: List<String>?,
        callback: IFrogoAdBanner?
    )

    fun showAdBanner(mAdView: AdView)

    fun showAdBanner(mAdView: AdView, timeoutMilliSecond: Int)

    fun showAdBanner(mAdView: AdView, keyword: List<String>)

    fun showAdBanner(mAdView: AdView, timeoutMilliSecond: Int, keyword: List<String>)

    fun showAdBanner(mAdView: AdView, callback: IFrogoAdBanner)

    fun showAdBanner(mAdView: AdView, timeoutMilliSecond: Int, callback: IFrogoAdBanner)

    fun showAdBanner(mAdView: AdView, keyword: List<String>, callback: IFrogoAdBanner)

    // ---------------------------------------------------------------------------------------------

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        timeoutMilliSecond: Int?,
        keyword: List<String>?,
        callback: IFrogoAdBanner?
    )

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
    )

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        timeoutMilliSecond: Int,
    )

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        keyword: List<String>,
    )

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        timeoutMilliSecond: Int,
        keyword: List<String>
    )

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        callback: IFrogoAdBanner
    )

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        timeoutMilliSecond: Int,
        callback: IFrogoAdBanner
    )

    fun showAdBannerContainer(
        context: Context,
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        keyword: List<String>,
        callback: IFrogoAdBanner
    )

    // ---------------------------------------------------------------------------------------------

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
        timeoutMilliSecond: Int?,
        keyword: List<String>?,
        callback: IFrogoAdInterstitial?
    )

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
        timeoutMilliSecond: Int,
        keyword: List<String>
    )

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
        timeoutMilliSecond: Int
    )

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
        keyword: List<String>
    )

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
    )

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
        timeoutMilliSecond: Int,
        callback: IFrogoAdInterstitial
    )

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
        keyword: List<String>,
        callback: IFrogoAdInterstitial
    )

    fun showAdInterstitial(
        activity: AppCompatActivity,
        interstitialAdUnitId: String,
        callback: IFrogoAdInterstitial
    )

    // ---------------------------------------------------------------------------------------------

    fun showAdRewarded(
        activity: AppCompatActivity,
        mAdUnitIdRewarded: String,
        timeoutMilliSecond: Int?,
        keyword: List<String>?,
        callback: IFrogoAdRewarded
    )

    fun showAdRewarded(
        activity: AppCompatActivity,
        mAdUnitIdRewarded: String,
        callback: IFrogoAdRewarded
    )

    fun showAdRewarded(
        activity: AppCompatActivity,
        mAdUnitIdRewarded: String,
        timeoutMilliSecond: Int,
        callback: IFrogoAdRewarded
    )

    fun showAdRewarded(
        activity: AppCompatActivity,
        mAdUnitIdRewarded: String,
        keyword: List<String>,
        callback: IFrogoAdRewarded
    )

    // ---------------------------------------------------------------------------------------------

    fun showAdRewardedInterstitial(
        activity: AppCompatActivity,
        mAdUnitIdRewardedInterstitial: String,
        timeoutMilliSecond: Int?,
        keyword: List<String>?,
        callback: IFrogoAdRewarded
    )

    fun showAdRewardedInterstitial(
        activity: AppCompatActivity,
        mAdUnitIdRewardedInterstitial: String,
        callback: IFrogoAdRewarded
    )

    fun showAdRewardedInterstitial(
        activity: AppCompatActivity,
        mAdUnitIdRewardedInterstitial: String,
        timeoutMilliSecond: Int,
        callback: IFrogoAdRewarded
    )

    fun showAdRewardedInterstitial(
        activity: AppCompatActivity,
        mAdUnitIdRewardedInterstitial: String,
        keyword: List<String>,
        callback: IFrogoAdRewarded
    )

    // ---------------------------------------------------------------------------------------------

    fun loadRecyclerBannerAds(
        bannerAdUnitId: String,
        context: Context,
        recyclerViewDataList: MutableList<Any>
    )

    fun addBannerAds(
        bannerAdUnitId: String,
        context: Context,
        recyclerViewDataList: MutableList<Any>
    )

    fun loadBannerAd(recyclerViewDataList: MutableList<Any>, index: Int)

    // ---------------------------------------------------------------------------------------------

}