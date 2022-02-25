package com.frogobox.appadmob.mvvm.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.frogobox.admob.core.FrogoAdmob
import com.frogobox.admob.core.IFrogoAdListener
import com.frogobox.admob.core.IFrogoAdmob
import com.frogobox.appadmob.R
import com.frogobox.appadmob.base.BaseActivity
import com.frogobox.appadmob.databinding.ActivityMainBinding
import com.frogobox.appadmob.javasample.MainJavaActivity
import com.frogobox.appadmob.mvvm.compose.ComposeActivity
import com.frogobox.appadmob.mvvm.compose.HybridActivity
import com.frogobox.appadmob.mvvm.movie.MovieActivity
import com.frogobox.appadmob.mvvm.news.NewsActivity
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.rewarded.RewardItem

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupButtonClick()
        setupShowAdsBannerContainer(
            this,
            AdSize.SMART_BANNER,
            binding.includeAdsView.frogoAdsBanner
        )
        setupShowAdsBanner(binding.adsXml.adsPhoneTabSpecialSmartBanner)
    }

    private fun setupButtonClick() {

        binding.apply {

            btnInterstitial.setOnClickListener {
                // setupShowAdsInterstitial()
                val listener = object : IFrogoAdListener.Interstitial {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        showToast("Gagal Iklan")
                    }

                    override fun onAdLoaded(interstitialAd: InterstitialAd) {

                    }
                }

                FrogoAdmob.Interstitial.setupInterstitial(this@MainActivity, "", listener)
                FrogoAdmob.Interstitial.showInterstitial(this@MainActivity, listener)
            }

            btnRewarded.setOnClickListener {
                setupShowAdsRewarded(object : IFrogoAdmob.UserEarned {
                    override fun onUserEarnedReward(rewardItem: RewardItem) {
                        // TODO User Get Reward
                    }
                })
            }

            btnRewardedInterstitial.setOnClickListener {
                setupShowAdsRewardedInterstitial(object : IFrogoAdmob.UserEarned {
                    override fun onUserEarnedReward(rewardItem: RewardItem) {
                        // TODO User Get Reward
                    }
                })
            }

            btnRecyclerView.setOnClickListener {
                baseStartActivity<NewsActivity>()
            }

            btnRecyclerView2.setOnClickListener {
                baseStartActivity<MovieActivity>()
            }

            btnComposeActivity.setOnClickListener {
                baseStartActivity<ComposeActivity>()
            }

            btnHybridActivity.setOnClickListener {
                baseStartActivity<HybridActivity>()
            }

            btnJavaSampleActivity.setOnClickListener {
                baseStartActivity<MainJavaActivity>()
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.toolbar_menu_about -> {
                baseStartActivity<AboutUsActivity>()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}