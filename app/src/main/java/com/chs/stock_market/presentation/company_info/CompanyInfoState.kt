package com.chs.stock_market.presentation.company_info

import com.chs.stock_market.domain.model.CompanyInfo
import com.chs.stock_market.domain.model.IntraDayInfo

data class CompanyInfoState(
    val stockInfos: List<IntraDayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
