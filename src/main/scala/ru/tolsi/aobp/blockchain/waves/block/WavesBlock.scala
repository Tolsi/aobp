package ru.tolsi.aobp.blockchain.waves.block

import ru.tolsi.aobp.blockchain.base.bytes.BytesSerializable
import ru.tolsi.aobp.blockchain.waves._
import ru.tolsi.aobp.blockchain.waves.transaction.WavesTransaction


abstract class WavesBlock extends Signable with Validable with StateChangeReason with BytesSerializable {
  type Id = Signature64

  def version: Byte

  def timestamp: Long

  def reference: Signature64

  def baseTarget: Long

  def generationSignature: Signature32

  def fee: WavesMoney[Either[Waves.type, Asset]]

  def transactions: Seq[SignedTransaction[WavesTransaction]]

  def generator: Account
}
