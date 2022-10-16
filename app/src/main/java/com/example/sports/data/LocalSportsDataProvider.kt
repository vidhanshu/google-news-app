/*
 * Copyright (c) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.sports.data

import com.example.sports.R
import com.example.sports.model.Sport

/**
 * Sports data
 */
object LocalSportsDataProvider{
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Sport> {
        return listOf(
            Sport(
                id = 1,
                titleResourceId = R.string.ministry,
                subtitleResourceId = R.string.ministry_subtitle,
                imageResourceId = R.drawable.ministry,
                sportsImageBanner = R.drawable.ministry_land,
                newsDetails = R.string.sports_news_detail_text
            ),
            Sport(
                id = 2,
                titleResourceId = R.string.crypto,
                subtitleResourceId = R.string.crypto_subtitle,
                imageResourceId = R.drawable.crypto,
                sportsImageBanner = R.drawable.crypto_land,
                newsDetails = R.string.sports_news_detail_text
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.urfi,
                subtitleResourceId = R.string.urfi_subtitle,
                imageResourceId = R.drawable.urfi,
                sportsImageBanner = R.drawable.urfi_landscape,
                newsDetails = R.string.sports_news_detail_text
            ),
            Sport(
                id = 4,
                titleResourceId = R.string.priyanka,
                subtitleResourceId = R.string.priyanka_subtitle,
                imageResourceId = R.drawable.malala,
                sportsImageBanner = R.drawable.ministry_land,
                newsDetails = R.string.sports_news_detail_text
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.data_science,
                subtitleResourceId = R.string.ds_subtitle,
                imageResourceId = R.drawable.datascience,
                sportsImageBanner = R.drawable.datascience_land,
                newsDetails = R.string.sports_news_detail_text
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.android,
                subtitleResourceId = R.string.android_subtitle,
                imageResourceId = R.drawable.android,
                sportsImageBanner = R.drawable.android_land,
                newsDetails = R.string.sports_news_detail_text
            )
        )
    }
}
