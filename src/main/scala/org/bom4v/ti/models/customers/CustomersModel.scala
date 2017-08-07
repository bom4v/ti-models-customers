package org.bom4v.ti.models.customers

/**
 * CustomersModel
 */
object CustomersModel {

  /**
   * CustomerUpdateEvent
   */
  case class CustomerUpdateEvent(
    timestamp: org.joda.time.LocalDateTime,
    eventType: String,
    customerMSISDN: Option[String]
  )
}

