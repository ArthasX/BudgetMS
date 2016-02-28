Ext.define('BudgetMS.view.ux.button.showAddBtn', {
	extend : 'BudgetMS.view.ux.button.baseBtn',
	alias:'widget.showAddBtn',
	listeners : {
		'click' : function(btn, e) {
			var tabpanel = Ext.getCmp('mainTabpanel');
			var tab = tabpanel.getActiveTab();
			var view = Ext.widget(tab.name + 'Add');
			// var view = Ext.create('BudgetMS.view.inst.add');// = Ext.widget
			// var grid = tab.down('gridview');
		}
	}
});