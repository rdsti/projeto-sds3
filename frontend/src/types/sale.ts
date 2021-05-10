import { Seller } from 'types/seller';

export type Sale = {
    id: number,
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller;
}

export type SalePage = {
    content?: Sale;
    last: boolean;
    totalPages: number;
    totalElements:number;
    number: number;
    numberOfElements?: number;
    first: boolean;
    size?: number;
    empty?: boolean;
}

export type SaleSum = {
    sellerName: string;
    sum: number;
}

export type SaleSuccess = {
    sellerName: string;
    visited: number;
    deals: number;
}