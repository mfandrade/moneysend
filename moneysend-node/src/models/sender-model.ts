import { MoneySender, RibaSender } from "../enterprise/entities/sender/sender";

const ribaSender: MoneySender = {
  amount: 0,
  id: "${string}-${string}-${string}-${string}-${string}",
  cpf: "",
  email: "",
  name: "",
  haveAccount: false
}

const ribaSender2: RibaSender<number> = {
  id: 0,
  name: "",
  type: ""
}