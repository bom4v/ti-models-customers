package org.bom4v.ti.models.customers

/**
 * CustomerAccountModel
 */
object CustomerAccountModel {

  /**
    * Schema for the churn model 
    */
  case class AccountForChurn (
    state: String,
    len: Integer,
    acode: String,
    intlplan: String,
    vplan: String,
    numvmail: Double,
    tdmins: Double,
    tdcalls: Double,
    tdcharge: Double,
    temins: Double,
    tecalls: Double,
    techarge: Double,
    tnmins: Double,
    tncalls: Double,
    tncharge: Double,
    timins: Double,
    ticalls: Double,
    ticharge: Double,
    numcs: Double,
    churn: String
  )
}

