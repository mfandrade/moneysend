import { UUID } from "crypto";

export interface MoneySender {
  id: UUID;
  cpf: string;
  email: string;
  name: string;
  amount: number;
  haveAccount: boolean;
}

export interface RibaSender<T> {
  id: number;
  name: string;
  type: T
}