/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Mustafa Bayar
 */
public interface IEntityRepository <T extends IEntity> {
    void add(T entity);
    void remove(T entity);
    void update(T entity);
}
